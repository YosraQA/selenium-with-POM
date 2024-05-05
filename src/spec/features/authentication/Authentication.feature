@authentification
Feature: Je me connecte a l application SWAGLABS
  En tant que utilisateur je souhaite m authentifier a l application SWAGLABS

  @connexion_ok
  Scenario: Authentification a l application SWAGLABS
    Given Je me connecte a l application SWAGLABS
    When Je saisis le Username "standard_user"
    And Je saisis le Password "secret_sauce"
    And Je clique sur le bouton LOGIN
    Then Je me suis redirigée vers la page home de SWAGLABS "Labs"
