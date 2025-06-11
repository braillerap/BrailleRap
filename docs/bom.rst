Liste du matériel
=================

Découpe laser
-------------

Pour BrailleRAP
<<<<<<<<<<<<<<<
2 planches de contreplaqué 5mm en 600mm x 400mm.

Les fichiers au format dxf sont disponibles ici : https://github.com/BrailleRap/BrailleRap/tree/master/lasercut
   * lasercut/Braillerap_v6-5-1_600x400-planche1.svg
   * lasercut/Braillerap_v6-5-1-600x400-planche2.svg


Pour BrailleRAP XL
<<<<<<<<<<<<<<<<<<
2 planches de contreplaqué 5mm en 900mm x 400mm.

Les fichiers au format dxf sont disponibles ici : https://github.com/BrailleRap/BrailleRap/tree/master/lasercut
   * lasercut/brapxl-v6.6-planche1_900x400.svg
   * lasercut/brapxl-v6-6-planche2_900x400.svg


Pièces imprimées
----------------
Toutes les pièces sont imprimées en ABS, 50% de remplissage, 3 périmètres extérieurs. Nous utilisons le filament eSun ABS Natural.

Les fichiers au format stl sont ici : https://github.com/braillerap/BrailleRap/tree/master/printed_parts
 

Pièces mécaniques
-----------------

Pour BrailleRAP
<<<<<<<<<<<<<<<

=== =========================================
Qty Type
=== =========================================
4   Rail de guidage linéaire ( diamètre 8mm ) **330 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **365 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **100 mm** length

2   630 mm de courroie GT2

3   Joints torique 15.1 mm diamètre intérieur 20.5 mm de diamètre extérieur (15.1 x 20.5 x 2.7)
3   Ressorts tendeurs de courroie GT2

...
=== =========================================
 

Pour BrailleRAP XL
<<<<<<<<<<<<<<<<<<

=== =========================================
Qty Type
=== =========================================
4   Rail de guidage linéaire ( diamètre 8mm ) **470 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **505 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **100 mm** length

2   960 mm de courroie GT2

4   Joints torique 15.1 mm diamètre intérieur 20.5 mm de diamètre extérieur (15.1 x 20.5 x 2.7)
4   Ressorts tendeurs de courroie GT2
...
=== =========================================


Pièces communes BrailleRAP XL / BrailleRAP
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

=== =========================================
Qty Type
=== =========================================
6   RJ4JP-01-08 palier linéaire Polymer  

3   GT2 poulie 20 dents pour axe 8mm    
2   GT2 poulie libre 20 dents axe 3mm (avec roulement à billes)
1   GT2 poulie 20 dents pour axe 5mm

2   KP08  pallier horizontal pour rail linéaire 8mm 
2   KFL08 pallier vertical pour rail linéaire 8mm 

1   Accouplement d'axe 5mm/8mm

1   Courroie GT2 fermée 200 mm

10	Colliers de serrage 2.5 x 160 mm

...
=== =========================================


Carte controleur
----------------
En fonction de vos souhaits vous pouvez utiliser au choix :

- Une carte MKS GEN 1.4 (Mega2560) et 2 drivers DRV8825 https://github.com/makerbase-mks
- Une carte MKS GEN-L (Mega2560) et 2 drivers DRV8825 https://github.com/makerbase-mks
- Une carte MKS TinyBee (ESP32) et 2 drivers TMC2209 https://github.com/makerbase-mks

D'autres configuration sont possibles, mais vous devrez effectuer la configuration du firmware vous même


Electronique
------------

=== ===========================================================================================
Qty Type
=== ===========================================================================================
2   Moteurs Nema 17 40 N/cm 40mm avec câble (17HS4401).        
1   Electro-aimant *tau-826b* 12V 2A.
1   MKS GEN 1.4 ou carte compatible Ramps 1.4 ou MKS GEN L 2.1 https://github.com/makerbase-mks.
2   drivers DRV8825 avec radiateur.
1   1N4004  diode de roue libre ou equivalent (12V 2A) (pour MKS GEN 1.4 uniquement).    
2   Commutateurs fin de course cablés conformément à la documentation. (OMRON `SS-5GL <https://omronfs.omron.com/en_US/ecb/products/pdf/en-ss.pdf>` ou compatible)
1   Embase Alimentation jack 2.5mm.
1   Alimentation 12v 6A jack 2.5mm.

=== ===========================================================================================



