Embosser votre première page de Braille
=======================================


BrailleRap est une machine qui se pilote en G-CODE, pour embosser du braille il faut tout d'abord traduire le texte en Braille.
Il existe 2 solutions pour traduire le Braille :
L'application BrailleRap en ligne https://crocsg.github.io/BrailleRap/
L'application NatBraille http://natbraille.free.fr 


Utilisation de l'application BrailleRap
---------------------------------------

Aller sur la page https://crocsg.github.io/BrailleRap/

.. image :: ./IMG/braillerapapp.png 
       :align: center
       
Entrer votre texte à l'endroit indiqué, et télécharger ensuite le fichier GCODE contenant les instructions pour l'embosseuse

.. image :: ./IMG/braillerapapp_download.png
       :align: center

Vous pouvez ensuite utiliser un logiciel comme **cura** ou **pronterface** pour envoyer le fichier GCODE à l'imprimante



Configuration NatBraille
------------------------

Compiler les programmes dans le repertoire NatBrailleTools du projet

Dans les options générales NatBraille, utiliser **TbFr2007** pour la table braille, Encodage document noir **Automtique**, Encodage document braille **Windows1252**

.. image :: ./IMG/natbraille.png
       :align: center

Dans les options d'embossage, utiliser **TbFr2007** pour la table braille pour l'embossage

Activer l'option **utiliser une commande systeme pour l'embossage**

le paramêtre  pour commande d'impression est : **java -jar d:\\usr\\home\\logger\\BrailleLogger.jar $f | java -jar d:\\usr\\home\\logger\\gcodestreamer.jar COM4 250000**
en modifiant eventuellement les repertoires d'installation des programmes
COM4 est le port serie utilisé pour communiquer avec l'imprimante

.. image :: ./IMG/natbrailleembossig.png
       :align: center


Dans les options de mise en page, indiquer 31 et 26 dans le nombre de caracter par ligne et le nombre de lignes par page

.. image :: ./IMG/natbraille_page.png
       :align: center

