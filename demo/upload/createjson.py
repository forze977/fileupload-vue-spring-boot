import json
import codecs
while(1):
    kanji = input('Kanji :' )
    on = input('On :')
    kun = input('Kun: ')
    thai = input('Thai: ')
    kanji = '"kanji":"'+kanji+'",'
    on = '"on":"'+on+'",'
    kun = '"kun":"'+kun+'",'
    thai = '"thai":"'+thai+'"'
    string = kanji + on + kun + thai
    f = open('results.txt','a+',encoding='utf8')
    f.write('{' + string + '},')
    f.close()
    print('--------------------------------')
