# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockstatgraphstyle | pk_stockstatgraphstyle | pk_stockstatgraphstyle | char(20) | √ |
| 2 | bgstripecolor | bgstripecolor | bgstripecolor | varchar2(50) |
| 3 | bgstripesize | bgstripesize | bgstripesize | number(38, 0) |
| 4 | corpcolor | corpcolor | corpcolor | varchar2(50) |
| 5 | corpgradientcolor | corpgradientcolor | corpgradientcolor | varchar2(50) |
| 6 | edgecolor | edgecolor | edgecolor | varchar2(50) |
| 7 | edgesize | edgesize | edgesize | number(38, 0) |
| 8 | expandlayers | expandlayers | expandlayers | number(38, 0) |
| 9 | fontcolor | fontcolor | fontcolor | varchar2(50) |
| 10 | fontsize | fontsize | fontsize | number(38, 0) |
| 11 | graphbgcolor | graphbgcolor | graphbgcolor | varchar2(50) |
| 12 | graphbgstripe | graphbgstripe | graphbgstripe | number(38, 0) |
| 13 | graphdirection | graphdirection | graphdirection | number(38, 0) |
| 14 | iscode | iscode | iscode | char(1) |
| 15 | isprefix | isprefix | isprefix | char(1) |
| 16 | linecornershape | linecornershape | linecornershape | number(38, 0) |
| 17 | lineendshape | lineendshape | lineendshape | varchar2(50) |
| 18 | linestartshape | linestartshape | linestartshape | varchar2(50) |
| 19 | maxnodesnum | maxnodesnum | maxnodesnum | number(38, 0) |
| 20 | orgview_type | orgview_type | orgview_type | number(38, 0) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | repertycolor | repertycolor | repertycolor | varchar2(50) |
| 23 | repertygradientcolor | repertygradientcolor | repertygradientcolor | varchar2(50) |
| 24 | stockgradientcolor | stockgradientcolor | stockgradientcolor | varchar2(50) |
| 25 | stockorgcolor | stockorgcolor | stockorgcolor | varchar2(50) |
| 26 | vertexbordercolor | vertexbordercolor | vertexbordercolor | varchar2(50) |
| 27 | vertexcornershape | vertexcornershape | vertexcornershape | number(38, 0) |
| 28 | vertexheight | vertexheight | vertexheight | number(28, 8) |
| 29 | vertexwidth | vertexwidth | vertexwidth | number(28, 8) |
| 30 | virorggradientcolor | virorggradientcolor | virorggradientcolor | varchar2(50) |
| 31 | virtualorgcolor | virtualorgcolor | virtualorgcolor | varchar2(50) |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |