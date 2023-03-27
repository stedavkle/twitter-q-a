# Twiqa | a DSL for Creating Q&A Active Games on Twitter

This project provides a domain-specific language (DSL) to facilitate the creation of Twitter bots for playing question/answer active games through the Twitter social network. The DSL allows users to configure games, analyze the game designs based on Petri nets, and execute the games based on Twitter APIs like Twitter4J.
Requirements

The games this project targets consist of tests that are to be solved across different spots within a city, within a given time limit. Each test can be configured with:

    A place where the answer needs to be given
    A time limit
    The text of the question
    A set of possible answers
    A number of attempts
    A set of hints (to be provided by the bot when the answer is wrong)
    A number of points to be awarded if the answer is correct

In addition, the designer of the game needs to specify the next tests when the answer is correct, when the answer is wrong, and when no answer is provided within the time limits. Each game should have exactly one initial test and one or more final tests.

## Functionality

The bot will wait until a Twitter user follows its account. Then, it gives a welcome message (as a direct message) with playing instructions. Then, the bot will send information about the initial test, including the location, maximum time, and allowed number of attempts. A test is successfully fulfilled by a user if:

    The answer is correct
    The position of the user when the tweet is sent is within the coordinates of the location
    The tweet was within the time limit

Note that the tweet text, timestamp, and position can be extracted with Twitter4J.

In addition, to validate the design of the game, a transformation into (timed) Petri nets is provided (where users are represented by tokens and tests by places). Using such Petri net, the game designer will be able to check the reachability of final tests, calculate mean completion times of the game, etc.
Installation

To use this project, you will need to install Twitter4J and its dependencies. You can then clone this repository and use the provided DSL to create your own Q&A active games on Twitter.

## Contributing

If you would like to contribute to this project, please submit a pull request or open an issue to discuss any proposed changes. All contributions are welcome!
License

This project is licensed under the MIT License. See the LICENSE file for details.
