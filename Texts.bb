;//////////////////////////////////////////////////////////////////////////////
;----------------------------- GRASS ROOTS: TEXTS -----------------------------
;//////////////////////////////////////////////////////////////////////////////

;//////////////////////////////////////////////////////
;------------------- KEY NAMES ------------------------
;//////////////////////////////////////////////////////
Dim Key$(255)
For count=0 To 255
 Key$(count)="?" 
Next
Key$(2)="1" : Key$(3)="2" : Key$(4)="3" : Key$(5)="4" : Key$(6)="5"
Key$(7)="6" : Key$(8)="7" : Key$(9)="8" : Key$(10)="9" : Key$(11)="0"
Key$(12)="-" : Key$(13)="+" : Key$(14)="Backspace" : Key$(15)="Tab"
Key$(16)="Q" : Key$(17)="W" : Key$(18)="E" : Key$(19)="R" : Key$(20)="T" : Key$(21)="Y"
Key$(22)="U" : Key$(23)="I" : Key$(24)="O" : Key$(25)="P" : Key$(26)="[" : Key$(27)="]"
Key$(29)="Left Ctrl" : Key$(30)="A" : Key$(31)="S" : Key$(32)="D" : Key$(33)="F" : Key$(34)="G"
Key$(35)="H" : Key$(36)="J" : Key$(37)="K" : Key$(38)="L" : Key$(39)=";" : Key$(40)="'" : Key$(41)="#"
Key$(42)="Left Shift" : Key$(43)="\" : Key$(44)="Z" : Key$(45)="X" : Key$(46)="C" : Key$(47)="V"
Key$(48)="B" : Key$(49)="N" : Key$(50)="M" : Key$(51)="," : Key$(52)="." : Key$(53)="/"
Key$(54)="Right Shift" : Key$(56)="Left Alt" : Key$(157)="Right Ctrl" : Key$(184)="Right Alt"
Key$(57)="Space" : Key$(200)="Cursor Up" : Key$(208)="Cursor Down" 
Key$(203)="Cursor Left" : Key$(205)="Cursor Right"

;//////////////////////////////////////////////////////
;-------------------- STATUS --------------------------
;//////////////////////////////////////////////////////
;weeks
Dim textWeek$(4)
textWeek$(1)=translate("1st week")
textWeek$(2)=translate("2nd week")
textWeek$(3)=translate("3rd week")
textWeek$(4)=translate("4th week")
;months
Dim textMonth$(12)
textMonth$(1)=translate("January")
textMonth$(2)=translate("February")
textMonth$(3)=translate("March")
textMonth$(4)=translate("April")
textMonth$(5)=translate("May")
textMonth$(6)=translate("June")
textMonth$(7)=translate("July")
textMonth$(8)=translate("August")
textMonth$(9)=translate("September")
textMonth$(10)=translate("October")
textMonth$(11)=translate("November")
textMonth$(12)=translate("December")
;blocks
Dim textBlock$(4)
textBlock$(1)=translate("North")
textBlock$(2)=translate("East")
textBlock$(3)=translate("South")
textBlock$(4)=translate("West")
;locations
Dim textLocation$(15)
textLocation$(0)=translate("None")
textLocation$(1)=translate("North Block")
textLocation$(2)=translate("Exercise Yard")
textLocation$(3)=translate("East Block")
textLocation$(4)=translate("Study")
textLocation$(5)=translate("South Block")
textLocation$(6)=translate("Hospital")
textLocation$(7)=translate("West Block")
textLocation$(8)=translate("Canteen")
textLocation$(9)=translate("Main Hall")
textLocation$(10)=translate("Workshop")
textLocation$(11)=translate("Bathroom")
;warrants
Dim textWarrant$(20)
textWarrant$(0)=translate("None")
textWarrant$(1)=translate("Dissent")
textWarrant$(2)=translate("Gang Membership")
textWarrant$(3)=translate("Trying To Escape")
textWarrant$(4)=translate("Carrying An Illegal Item")
textWarrant$(5)=translate("Drug Abuse")
textWarrant$(6)=translate("Dealing")
textWarrant$(7)=translate("Stealing")
textWarrant$(8)=translate("Assault")
textWarrant$(9)=translate("Assaulting A Warden")
textWarrant$(10)=translate("Assault With A Weapon")
textWarrant$(11)=translate("Grievous Bodily Harm")
textWarrant$(12)=translate("Attempted Murder")
textWarrant$(13)=translate("Murder")
textWarrant$(14)=translate("Serial Murder")
;crimes
Dim textCrime$(20)
textCrime$(0)=translate("None")
textCrime$(1)=translate("Fraud")
textCrime$(2)=translate("Prostitution")
textCrime$(3)=translate("Drug Abuse")
textCrime$(4)=translate("Drug Dealing")
textCrime$(5)=translate("Theft")
textCrime$(6)=translate("Armed Robbery")
textCrime$(7)=translate("Vandalism")
textCrime$(8)=translate("Assault")
textCrime$(9)=translate("Child Abuse")
textCrime$(10)=translate("Rape")
textCrime$(11)=translate("Grievous Bodily Harm")
textCrime$(12)=translate("Attempted Murder")
textCrime$(13)=translate("Manslaughter")
textCrime$(14)=translate("Murder")
textCrime$(15)=translate("Terrorism")
;gangs
Dim textGang$(6)
textGang$(0)=translate("None")
textGang$(1)=translate("The Suns Of God")
textGang$(2)=translate("The Avatars Of Allah")
textGang$(3)=translate("The Dark Side")
textGang$(4)=translate("The Powers That Be")
textGang$(5)=translate("The Gladiators")
textGang$(6)=translate("The Peaks")
;gang member
Dim textMember$(6)
textMember$(0)=translate("None")
textMember$(1)=translate("a Sun Of God")
textMember$(2)=translate("an Avatar Of Allah")
textMember$(3)=translate("a Dark Force")
textMember$(4)=translate("a Power")
textMember$(5)=translate("a Gladiator")
textMember$(6)=translate("a Peak")

;//////////////////////////////////////////////////////
;------------------- OPTIONS --------------------------
;//////////////////////////////////////////////////////
;on/off
Dim textOnOff$(1)
textOnOff$(0)=translate("Off")
textOnOff$(1)=translate("On")
;resolution
Dim textResX$(5),textResY$(5)
textResX$(0)="320" : textResY$(0)="240"
textResX$(1)="640" : textResY$(1)="480"
textResX$(2)="800" : textResY$(2)="600"
textResX$(3)="1024" : textResY$(3)="768"
textResX$(4)="1280" : textResY$(4)="1024"
textResX$(5)="1280" : textResY$(5)="800"
;gore
Dim textGore$(5)
textGore$(0)=translate("None")
textGore$(1)=translate("Scars Only")
textGore$(2)=translate("Scars & Pools")
textGore$(3)=translate("Scars, Pools, & Limb Loss")
;particle effects
Dim textFX$(3)
textFX$(0)=translate("None")
textFX$(1)=translate("Minimal")
textFX$(2)=translate("Maximum")
;shadows
Dim textShadows$(3)
textShadows$(0)=translate("None")
textShadows$(1)=translate("Minimal")
textShadows$(2)=translate("Maximum")

;//////////////////////////////////////////////////////
;---------------- CHARACTERIZATION --------------------
;//////////////////////////////////////////////////////
;hair references
Dim hairFile$(15)
hairFile$(1)="Hair_Bald"
hairFile$(2)="Hair_Thin"
hairFile$(3)="Hair_Short"
hairFile$(4)="Hair_Raise"
hairFile$(5)="Hair_Quiff"
hairFile$(6)="Hair_Mop"
hairFile$(7)="Hair_Thick"
hairFile$(8)="Hair_Full"
hairFile$(9)="Hair_Curl"
hairFile$(10)="Hair_Afro"
hairFile$(11)="Hair_Spike"
hairFile$(12)="Hair_Punk"
hairFile$(13)="Hair_Rolls"
hairFile$(14)="Hair_Pony"
hairFile$(15)="Hair_Long"
;hair styles
Dim textHair$(40)
textHair$(0)=translate("Bald")
textHair$(1)=translate("Shaved")
textHair$(2)=translate("Balding")
textHair$(3)=translate("Receding")
textHair$(4)=translate("Short")
textHair$(5)=translate("Raised")
textHair$(6)=translate("Quiff")
textHair$(7)=translate("Fringe")
textHair$(8)=translate("Thick")
textHair$(9)=translate("Full")
textHair$(10)=translate("Small Afro")
textHair$(11)=translate("Big Afro")
textHair$(12)=translate("Spikey")
textHair$(13)=translate("Mohican")
textHair$(14)=translate("Corn Rows")
textHair$(15)=translate("Balding w/Ponytail")
textHair$(16)=translate("Receding w/Ponytail")
textHair$(17)=translate("Short w/Ponytail")
textHair$(18)=translate("Raised w/Ponytail")
textHair$(19)=translate("Quiff w/Ponytail")
textHair$(20)=translate("Fringe w/Ponytail")
textHair$(21)=translate("Thick w/Ponytail")
textHair$(22)=translate("Afro w/Ponytail")
textHair$(23)=translate("Mohican w/Ponytail")
textHair$(24)=translate("Rows w/Ponytail")
textHair$(25)=translate("Balding w/Length")
textHair$(26)=translate("Receding w/Length")
textHair$(27)=translate("Short w/Length")
textHair$(28)=translate("Raised w/Length")
textHair$(29)=translate("Quiff w/Length")
textHair$(30)=translate("Fringe w/Length")
textHair$(31)=translate("Thick w/Length")
;eyewear
Dim textSpecs$(5)
textSpecs$(0)=translate("None")
textSpecs$(1)=translate("Gold Frames")
textSpecs$(2)=translate("Silver Frames")
textSpecs$(3)=translate("Dark Frames")
textSpecs$(4)=translate("Sunglasses")
;models
Dim textModel$(10)
textModel$(1)=translate("Slim")
textModel$(2)=translate("Normal")
textModel$(3)=translate("Muscular")
textModel$(4)=translate("Chubby")
textModel$(5)=translate("Fat")
;costumes
Dim textCostume$(10)
textCostume$(0)=translate("Bare Chest")
textCostume$(1)=translate("Tight Vest")
textCostume$(2)=translate("Baggy Vest")
textCostume$(3)=translate("Tight T-Shirt")
textCostume$(4)=translate("Baggy T-Shirt")
textCostume$(5)=translate("Tight Short Sleeve")
textCostume$(6)=translate("Baggy Short Sleeve")
textCostume$(7)=translate("Tight Long Sleeve")
textCostume$(8)=translate("Baggy Long Sleeve")
;races
Dim textRace$(3)
textRace$(0)=translate("white")
textRace$(1)=translate("Asian")
textRace$(2)=translate("black")

;//////////////////////////////////////////////////////
;------------------------ NAMES -----------------------
;//////////////////////////////////////////////////////
;first names
Dim textFirstName$(100)
textFirstName$(0)=translate("Vic")
textFirstName$(1)=translate("Eddie")
textFirstName$(2)=translate("Matt")
textFirstName$(3)=translate("Liam")
textFirstName$(4)=translate("Stuart")
textFirstName$(5)=translate("Scott")
textFirstName$(6)=translate("Mike")
textFirstName$(7)=translate("Gez")
textFirstName$(8)=translate("Adam")
textFirstName$(9)=translate("Joe")
textFirstName$(10)=translate("Lee")
textFirstName$(11)=translate("Alan")
textFirstName$(12)=translate("Dennis")
textFirstName$(13)=translate("Peter")
textFirstName$(14)=translate("Leon")
textFirstName$(15)=translate("Andy")
textFirstName$(16)=translate("Theo")
textFirstName$(17)=translate("Dan")
textFirstName$(18)=translate("Henry")
textFirstName$(19)=translate("Grant")
textFirstName$(20)=translate("Anton")
textFirstName$(21)=translate("Des")
textFirstName$(22)=translate("Arnie")
textFirstName$(23)=translate("Tom")
textFirstName$(24)=translate("Paul")
textFirstName$(25)=translate("Tony")
textFirstName$(26)=translate("Nick")
textFirstName$(27)=translate("Steve")
textFirstName$(28)=translate("Vince")
textFirstName$(29)=translate("John")
textFirstName$(30)=translate("Gordon")
textFirstName$(31)=translate("Chris")
textFirstName$(32)=translate("Rob")
textFirstName$(33)=translate("Ray")
textFirstName$(34)=translate("Mick")
textFirstName$(35)=translate("Rick")
textFirstName$(36)=translate("Abe")
textFirstName$(37)=translate("Nate")
textFirstName$(38)=translate("Dave")
textFirstName$(39)=translate("David")
textFirstName$(40)=translate("Ian")
textFirstName$(41)=translate("Trent")
textFirstName$(42)=translate("Fred")
textFirstName$(43)=translate("Kanye")
textFirstName$(44)=translate("Sean")
textFirstName$(45)=translate("Shawn")
textFirstName$(46)=translate("Nasir")
textFirstName$(47)=translate("George")
textFirstName$(48)=translate("Obie")
textFirstName$(49)=translate("Robin")
textFirstName$(50)=translate("Keith")
textFirstName$(51)=translate("Sgt")
textFirstName$(52)=translate("Dr")
textFirstName$(53)=translate("Mr")
textFirstName$(54)=translate("Tim")
textFirstName$(55)=translate("Jerry")
textFirstName$(56)=translate("Larry")
textFirstName$(57)=translate("Ted")
textFirstName$(58)=translate("Lance")
textFirstName$(59)=translate("Gaz")
textFirstName$(60)=translate("Kevin")
textFirstName$(61)=translate("Frank")
textFirstName$(62)=translate("Bruce")
textFirstName$(63)=translate("Gavin")
textFirstName$(64)=translate("Cody")
textFirstName$(65)=translate("Noel")
;surnames
Dim textSurName$(100)
textSurName$(0)=translate("Aceveda")
textSurName$(1)=translate("Sanders")
textSurName$(2)=translate("Grimm")
textSurName$(3)=translate("Clark")
textSurName$(4)=translate("Evans")
textSurName$(5)=translate("Bryant")
textSurName$(6)=translate("Madison")
textSurName$(7)=translate("Jackson")
textSurName$(8)=translate("Mackey")
textSurName$(9)=translate("Rooney")
textSurName$(10)=translate("Gaunt")
textSurName$(11)=translate("Collins")
textSurName$(12)=translate("Dickin")
textSurName$(13)=translate("Loveday")
textSurName$(14)=translate("Atkins")
textSurName$(15)=translate("Luther")
textSurName$(16)=translate("Walsch")
textSurName$(17)=translate("Vessey")
textSurName$(18)=translate("Osborne")
textSurName$(19)=translate("Diaz")
textSurName$(20)=translate("Sipowicz")
textSurName$(21)=translate("Taylor")
textSurName$(22)=translate("Jones")
textSurName$(23)=translate("Smith")
textSurName$(24)=translate("McCall")
textSurName$(25)=translate("Neeson")
textSurName$(26)=translate("Samson")
textSurName$(27)=translate("Simpson")
textSurName$(28)=translate("McMahon")
textSurName$(29)=translate("Hardass")
textSurName$(30)=translate("Compton")
textSurName$(31)=translate("Clapson")
textSurName$(32)=translate("Walker")
textSurName$(33)=translate("Kiljoy")
textSurName$(34)=translate("Cameron")
textSurName$(35)=translate("Blair")
textSurName$(36)=translate("Hawksbee")
textSurName$(37)=translate("Galloway")
textSurName$(38)=translate("Madden")
textSurName$(39)=translate("Austin")
textSurName$(40)=translate("Simmons")
textSurName$(41)=translate("Medavoy")
textSurName$(42)=translate("Lister")
textSurName$(43)=translate("Rimmer")
textSurName$(44)=translate("Bishop")
textSurName$(45)=translate("Hogan")
textSurName$(46)=translate("Duggan")
textSurName$(47)=translate("Lawler")
textSurName$(48)=translate("Brown")
textSurName$(49)=translate("Keaton")
textSurName$(50)=translate("Steiner")
textSurName$(51)=translate("Combs")
textSurName$(52)=translate("Carter")
textSurName$(53)=translate("Bush")
textSurName$(54)=translate("Nixon")
textSurName$(55)=translate("Mathers")
textSurName$(56)=translate("Schwarz")
textSurName$(57)=translate("Rajah")
textSurName$(58)=translate("Foster")
textSurName$(59)=translate("Robson")
textSurName$(60)=translate("Manson")
textSurName$(61)=translate("Pearce")
textSurName$(62)=translate("Epton")
textSurName$(63)=translate("Dearden")
textSurName$(64)=translate("Mitchell")
textSurName$(65)=translate("Mendoza")
;nicknames
Dim textNickName$(100)
textNickName$(0)="Lemonhead"
textNickName$(1)="Sugar Tits"
textNickName$(2)="Hat Trick"
textNickName$(3)="Deep Throat"
textNickName$(4)="Big Hit"
textNickName$(5)="Super Lucha"
textNickName$(6)="Machoman"
textNickName$(7)="Heavyweight"
textNickName$(8)="Thug Angel"
textNickName$(9)="God's Son"
textNickName$(10)="Escobar"
textNickName$(11)="Young Boy"
textNickName$(12)="Wide Boy"
textNickName$(13)="Mr Tickle"
textNickName$(14)="Handyman"
textNickName$(15)="Lyracist"
textNickName$(16)="Maitreya"
textNickName$(17)="Piston Pecker"
textNickName$(18)="Kampas Krismas"
textNickName$(19)="Baby Bull"
textNickName$(20)="Fast Eddie"
textNickName$(21)="Slick Rick"
textNickName$(22)="Toadfish"
textNickName$(23)="Octogon"
textNickName$(24)="Riverside"
textNickName$(25)="Wussy Lee"
textNickName$(26)="Scotbird"
textNickName$(27)="Thunder Lips"
textNickName$(28)="Agony Aunt"
textNickName$(29)="Downtown"
textNickName$(30)="Boomtown"
textNickName$(31)="Voodoo Child"
textNickName$(32)="Little Voice"
textNickName$(33)="Brother Bear"
textNickName$(34)="Maverick"
textNickName$(35)="Sure Shank"
textNickName$(36)="Needles"
textNickName$(37)="Iceman"
textNickName$(38)="Crazy Jew"
textNickName$(39)="Scally"
textNickName$(40)="Wise Len"
textNickName$(41)="Sunshine"
textNickName$(42)="Terminator"
textNickName$(43)="Safe Hands"
textNickName$(44)="Fairytale"
textNickName$(45)="Original G"
textNickName$(46)="Deep Impact"
textNickName$(47)="Road Pig"
textNickName$(48)="X-Factor"
textNickName$(49)="Spacker"
textNickName$(50)="Fabulous M"
textNickName$(51)="Menace"
textNickName$(52)="Nasty Nas"
textNickName$(53)="King Carter"
textNickName$(54)="Sure Shot"
textNickName$(55)="Major Merc"
textNickName$(56)="Messiah"
textNickName$(57)="King Sin"
textNickName$(58)="Farrenheit"
textNickName$(59)="Roughcock"
textNickName$(60)="Syntax Error"
textNickName$(61)="Muhammad"
textNickName$(62)="Zansibar"
textNickName$(63)="Bent Rat"
textNickName$(64)="Kid Gloves"
textNickName$(65)="Third Eye"
textNickName$(66)="Tin Ear"
textNickName$(67)="Iron Mic"
textNickName$(68)="Ghetto Child"
textNickName$(69)="Bang Bang"
textNickName$(70)="Apocolypto"
textNickName$(71)="Warrior"
textNickName$(72)="Big Pussy"
textNickName$(73)="Duke Nukem"
textNickName$(74)="Body Bag"
textNickName$(75)="Cum Bucket"
textNickName$(76)="Steroid Roy"
textNickName$(77)="Bulletproof"
textNickName$(78)="Stone Malone"
textNickName$(79)="Assassin"
textNickName$(80)="Nightmare"