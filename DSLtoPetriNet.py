if __name__ == "__main__":


    # Import the required modules
    import xmltodict
    import pprint
    import xml.etree.cElementTree as ET
      
    # Open the file and read the contents
    # EITHER: main.twiqaOneGame.xmi
    # OR: main.twiqaSeveralGames.xmi
    # 
    with open('main.twiqa.xmi', 'r', encoding='utf-8') as file:
        my_xml = file.read()
      
    # Use xmltodict to parse and convert 
    # the XML document
    my_dict = xmltodict.parse(my_xml)
      
    # Print the dictionary
    #pprint.pprint(my_dict, indent=2)

    project = ET.Element("project", {"name": "CreatedGames", "version": "121"})
    gspn = ET.SubElement(project, "gspn", {"name": "PT", "show-color-cmd": "false", "show-fluid-cmd": "false", "show-timed-cmd": "false", "view-rates": "false"})
    nodes = ET.SubElement(gspn, "nodes")
    edges = ET.SubElement(gspn, "edges")

    # dictionaries are only needed, so that no overwriting of an already existing place or arc appears
    # transitions are later used to build up the arcs
    place = {}
    transition = {}
    arc = {}
    # x and y count are used, to place the 
    y_count = 1
    x_count = 1

    # create a pool for the players to start in
    place['players_pool'] = ET.SubElement(nodes, "place", {"marking": "1", "name": 'players_pool', "x": str(x_count), "y": str(y_count)})
    y_count += 2
    x_count += 2

    ###--- looping over the game(s), to create the places and according transitions ---###

    # if the DSL contains more than one game, go through here
    if type(my_dict['TwitterQA:TwitterQA']['games']) == list:
        # go through every game and create the corresponding places and transitions
        for game in my_dict['TwitterQA:TwitterQA']['games']:
            # the space between strings is taken out of the strings, since GreatSPN doesn't like them in the IDs
            game_name = game['@name'].replace(" ", "")
            # create a transition from the players to the current game
            trans_name = "players_pool" + "TO" + game_name
            transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
            place[game_name] = ET.SubElement(nodes, "place", {"name": game_name, "x": str(x_count), "y": str(y_count)})
            y_count += 2
            x_count += 2
            # set transition from game to initial_test
            initial_test_name = game['initial_test']['@name'].replace(" " , "")
            trans_name = str(game_name) + "TO" + initial_test_name
            transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
            # set the place for the initial_test
            place[initial_test_name] = ET.SubElement(nodes, "place", {"name": initial_test_name, "x": str(x_count), "y": str(y_count)})
            y_count += 2
            x_count += 2
            # create transitions, if the test contains test in the corresponding keys
            if '@on_correct' in game['initial_test'].keys():
                trans_name = initial_test_name + "TO" + str(game['initial_test']['@on_correct'])
                transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                y_count += 2
                x_count += 2
            elif '@on_fail' in test.keys():
                trans_name = initial_test_name + "TO" + str(game['initial_test']['@on_correct'])
                transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                y_count += 2
                x_count += 2
            elif '@on_timeout' in test.keys():
                trans_name = str(test_name) + "TO" + str(test['@on_timeout'])
                transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                y_count += 2
                x_count += 2
            # if there are several tests in the game, go through the list and create the corresponding places and transitions
            if type(game['tests']) == list:
                # go through every test and create the corresponding places and transitions
                for test in game['tests']:
                    # set the place for the following tests
                    test_name = test['@name'].replace(" ", "")
                    place[test_name] = ET.SubElement(nodes, "place", {"name": test_name, "x": str(x_count), "y": str(y_count)})
                    # create transitions, if the test contains test in the corresponding keys
                    if '@on_correct' in test.keys():
                        trans_name = test_name + "TO" + str(test['@on_correct'])
                        transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                        y_count += 2
                        x_count += 2
                    elif '@on_fail' in test.keys():
                        trans_name = test_name + "TO" + str(test['@on_fail'])
                        transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                        y_count += 2
                        x_count += 2
                    elif '@on_timeout' in test.keys():
                        trans_name = test_name + "TO" + str(test['@on_timeout'])
                        transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                        y_count += 2
                        x_count += 2
                    # if the test doesn't contain any furhter test, it is the final test and the players must return to the
                    # players pool 
                    else:
                        trans_name = test_name + "TO" + "players_pool"
                        transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                        y_count += 2
                        x_count += 2
            # if the game only contains one test
            else:
                # set the place for the following tests
                test_name = game['tests']['@name'].replace(" ", "")
                place[test_name] = ET.SubElement(nodes, "place", {"name": test_name, "x": str(x_count), "y": str(y_count)})
                # the test doesn't contain any furhter test, so the player can go directly back to the pool
                # players pool 
                trans_name = test_name + "TO" + "players_pool"
                transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                y_count += 2
                x_count += 2
                

    # if it contains exactly one, do this here
    else: 
        game = my_dict['TwitterQA:TwitterQA']['games']
        # the space between strings is taken out of the strings, since GreatSPN doesn't like them in the IDs
        game_name = game['@name'].replace(" ", "")
        # create a transition from the players to the current game
        trans_name = "players_pool" + "TO" + game_name
        transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
        place[game_name] = ET.SubElement(nodes, "place", {"name": game_name, "x": str(x_count), "y": str(y_count)})
        y_count += 2
        x_count += 2
        # set transition from game to initial_test
        initial_test_name = game['initial_test']['@name'].replace(" " , "")
        trans_name = str(game_name) + "TO" + initial_test_name
        transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
        # set the place for the initial_test
        place[initial_test_name] = ET.SubElement(nodes, "place", {"name": initial_test_name, "x": str(x_count), "y": str(y_count)})
        y_count += 2
        x_count += 2
        # create transitions, if the test contains test in the corresponding keys
        if '@on_correct' in game['initial_test'].keys():
            trans_name = initial_test_name + "TO" + str(game['initial_test']['@on_correct'])
            transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
            y_count += 2
            x_count += 2
        elif '@on_fail' in test.keys():
            trans_name = initial_test_name + "TO" + str(game['initial_test']['@on_correct'])
            transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
            y_count += 2
            x_count += 2
        elif '@on_timeout' in test.keys():
            trans_name = str(test_name) + "TO" + str(test['@on_timeout'])
            transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
            y_count += 2
            x_count += 2
        # if there are several tests in the game, go through the list and create the corresponding places and transitions
        if type(game['tests']) == list:
            # go through every test and create the corresponding places and transitions
            for test in game['tests']:
                # set the place for the following tests
                test_name = test['@name'].replace(" ", "")
                place[test_name] = ET.SubElement(nodes, "place", {"name": test_name, "x": str(x_count), "y": str(y_count)})
                # create transitions, if the test contains test in the corresponding keys
                if '@on_correct' in test.keys():
                    trans_name = test_name + "TO" + str(test['@on_correct'])
                    transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                    y_count += 2
                    x_count += 2
                elif '@on_fail' in test.keys():
                    trans_name = test_name + "TO" + str(test['@on_fail'])
                    transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                    y_count += 2
                    x_count += 2
                elif '@on_timeout' in test.keys():
                    trans_name = test_name + "TO" + str(test['@on_timeout'])
                    transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                    y_count += 2
                    x_count += 2
                # if the test doesn't contain any furhter test, it is the final test and the players must return to the
                # players pool 
                else:
                    trans_name = test_name + "TO" + "players_pool"
                    transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
                    y_count += 2
                    x_count += 2
        # if the game only contains one test
        else:
            # set the place for the following tests
            test_name = game['tests']['@name'].replace(" ", "")
            place[test_name] = ET.SubElement(nodes, "place", {"name": test_name, "x": str(x_count), "y": str(y_count)})
            # the test doesn't contain any furhter test, so the player can go directly back to the pool
            # players pool 
            trans_name = test_name + "TO" + "players_pool"
            transition[trans_name] = ET.SubElement(nodes, "transition", {"name": trans_name, "nservers-x": "0.5", "type": "EXP", "x": str(x_count/2), "y": str(y_count/2)})
            y_count += 2
            x_count += 2

    ###--- looping over the transitions, to create the arcs ---###
    arc_nums = 1
    for i in transition:
        # create a arc name, to not overwrite the same arc over and over again
        i = i.replace(" ", "")
        arc_name = i + str(arc_nums)
        # split the string of the transition, to get the two tests, which should be connected by an arc
        split_transition = i.split("TO")    
        start_place = split_transition[0]
        goal_place = split_transition[1]
        # i is also used for the arc, since the arc spans from place1 to place2 over the transition, so it is needed too
        arc[arc_name] = ET.SubElement(edges, "arc", {"head": i, "kind": "INPUT", "tail": start_place})
        arc[arc_name] = ET.SubElement(edges, "arc", {"head": goal_place, "kind": "OUTPUT", "tail": i})

    tree = ET.ElementTree(project)
    tree.write("CreatedGames.xml")

