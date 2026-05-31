# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10858.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alertregistry | pk_alertregistry | pk_alertregistry | char(20) | √ |
| 2 | accountpk | accountpk | accountpk | varchar2(30) |
| 3 | alertname | alertname | alertname | varchar2(80) |
| 4 | alertname2 | alertname2 | alertname2 | varchar2(80) |
| 5 | alertname3 | alertname3 | alertname3 | varchar2(80) |
| 6 | alertname4 | alertname4 | alertname4 | varchar2(80) |
| 7 | alertname5 | alertname5 | alertname5 | varchar2(80) |
| 8 | alertname6 | alertname6 | alertname6 | varchar2(80) |
| 9 | clusterflag | clusterflag | clusterflag | varchar2(200) |
| 10 | curlang | curlang | curlang | varchar2(20) |
| 11 | description | description | description | varchar2(256) |
| 12 | enabled | enabled | enabled | char(1) |
| 13 | filename | filename | filename | varchar2(80) |
| 14 | groupid | groupid | groupid | varchar2(20) |  |  | '~' |
| 15 | ismessagetemplate | ismessagetemplate | ismessagetemplate | char(1) |
| 16 | istiming | istiming | istiming | char(1) |
| 17 | maxlogs | maxlogs | maxlogs | number(38, 0) |
| 18 | message | message | message | varchar2(512) |
| 19 | messagefile | messagefile | messagefile | varchar2(128) |
| 20 | msgtitle | msgtitle | msgtitle | varchar2(200) |
| 21 | msgtitle2 | msgtitle2 | msgtitle2 | varchar2(200) |
| 22 | msgtitle3 | msgtitle3 | msgtitle3 | varchar2(200) |
| 23 | pk_alerttype | pk_alerttype | pk_alerttype | varchar2(20) |  |  | '~' |
| 24 | pk_messagetemplate | pk_messagetemplate | pk_messagetemplate | varchar2(50) |
| 25 | pk_org | pk_org | pk_org | varchar2(50) |
| 26 | pushable | pushable | pushable | char(1) |
| 27 | registrytype | registrytype | registrytype | number(38, 0) |
| 28 | reportlikework | reportlikework | reportlikework | blob |
| 29 | scheduletaskid | scheduletaskid | scheduletaskid | varchar2(30) |
| 30 | servername | servername | servername | varchar2(200) |
| 31 | simplemessage | simplemessage | simplemessage | varchar2(500) |
| 32 | simplemessage2 | simplemessage2 | simplemessage2 | varchar2(500) |
| 33 | simplemessage3 | simplemessage3 | simplemessage3 | varchar2(500) |
| 34 | withtranscation | withtranscation | withtranscation | char(1) |
| 35 | creator | creator | creator | varchar2(20) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |