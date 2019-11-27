# PasswordsVault
This repository contains the code for the PasswordsVault we are working on as a grade 12 ICS summative.

# Planning

## NOTE:
- We will be using the ISSUES tab as well as the PROJECT tab for scheduling and organizing tasks/problems we encounter. It will tell you how we divided the work and how we worked through some problems.

## CONCEPT:
- An offline version of LAST PASS that works with google authenticator to store a variety of accounts disconnected from the internet
- Will be running 24/7 on a Raspberry pi
- Generate and add accounts/passwords given requirements

## OBJECTIVES:
- Use forms of encryption, obfuscation, and hashing technology
- Integration with google apps and OAuth 2.0

## RULES/GAME MECHANICS:
- Login page
- Google Auth with 2FA
  - 6 digit number that you need to get
- Add and remove passwords
- Store usernames/notes/other information for the account
- Change passwords (locally)
- Generate password based on requirements set
  - Letters, numbers, symbols, length
- Encrypted document where passwords are stored
- Sends email (SMS IF POSSIBLE) to owner if multiple failed attempts
- Different types of accounts
  - API keys
  - Basic accounts
  - Admin Accounts
  - WIFI passwords
- Regenerate API keys automatically if possible

## FLOWCHART
[![Flowchart](https://i.gyazo.com/631b02f44389a96b196f85b65a9a5b8a.png)](https://gyazo.com/631b02f44389a96b196f85b65a9a5b8a)

## UML DIAGRAMS
All UML diagrams for crucial classes below. They are subject to change as we refine our plan.

### GameScreen
[![UML Login](https://i.gyazo.com/b7529996b799ccb00a8f139d780ff093.png)](https://gyazo.com/b7529996b799ccb00a8f139d780ff093)

### Passwords Screen
[![UML Passwords](https://i.gyazo.com/f6438d8eddabe9fd8aa5efffa6283065.png)](https://gyazo.com/f6438d8eddabe9fd8aa5efffa6283065)

### Auth
[![UML Auth](https://i.gyazo.com/7afd0bc6e4fed62631c47d7049cb7d6b.png)](https://gyazo.com/7afd0bc6e4fed62631c47d7049cb7d6b)

### AddPassword
[![UML AddPassword](https://i.gyazo.com/45d3752aa07f193486c307ba4ba52295.png)](https://gyazo.com/45d3752aa07f193486c307ba4ba52295)

## GUI Plans
Contains images showing roughly what the GUI will look like

### Login page

### Passwords Screen

### Add Passwords Screen

## Algorithm
See [Document](https://docs.google.com/document/d/1R-mhJIlmV5fySRAlapsGy6OOSaswbmq1BVEF4wi_m4U/edit?usp=sharing)

## Pseudocode
See [Document](https://docs.google.com/document/d/14GeOpZbgg7ocjY_B1ohSnmWCjJezNrnDTOl5dKOGdsw/edit?usp=sharing)
