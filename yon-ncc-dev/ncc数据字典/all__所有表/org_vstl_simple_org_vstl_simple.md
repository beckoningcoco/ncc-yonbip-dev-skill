# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_graphstyle | pk_graphstyle | pk_graphstyle | char(20) | √ |
| 2 | bgstripecolor | bgstripecolor | bgstripecolor | varchar2(50) |
| 3 | bgstripesize | bgstripesize | bgstripesize | number(38, 0) |
| 4 | edgecolor | edgecolor | edgecolor | varchar2(50) |
| 5 | edgesize | edgesize | edgesize | number(38, 0) |
| 6 | expandlayers | expandlayers | expandlayers | number(38, 0) |
| 7 | fontcolor | fontcolor | fontcolor | varchar2(50) |
| 8 | fontsize | fontsize | fontsize | number(38, 0) |
| 9 | graphbgcolor | graphbgcolor | graphbgcolor | varchar2(50) |
| 10 | graphbgstripe | graphbgstripe | graphbgstripe | number(38, 0) | √ |  | 0 |
| 11 | graphdirection | graphdirection | graphdirection | number(38, 0) | √ |  | 0 |
| 12 | iscode | iscode | iscode | char(1) |
| 13 | isprefix | isprefix | isprefix | char(1) |
| 14 | linecornershape | linecornershape | linecornershape | number(38, 0) |
| 15 | lineendshape | lineendshape | lineendshape | varchar2(50) |
| 16 | linestartshape | linestartshape | linestartshape | varchar2(50) |
| 17 | maxnodesnum | maxnodesnum | maxnodesnum | number(38, 0) |
| 18 | orgview_type | orgview_type | orgview_type | number(38, 0) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | vertexbgcolor | vertexbgcolor | vertexbgcolor | varchar2(50) |
| 21 | vertexbordercolor | vertexbordercolor | vertexbordercolor | varchar2(50) |
| 22 | vertexcornershape | vertexcornershape | vertexcornershape | number(38, 0) |
| 23 | vertexgradientcolor | vertexgradientcolor | vertexgradientcolor | varchar2(50) |
| 24 | vertexheight | vertexheight | vertexheight | number(28, 8) |
| 25 | vertexwidth | vertexwidth | vertexwidth | number(28, 8) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |