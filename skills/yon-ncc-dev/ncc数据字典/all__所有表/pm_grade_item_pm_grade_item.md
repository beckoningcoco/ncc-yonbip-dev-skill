# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10614.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | archiveid | archiveid | archiveid | varchar2(32) |
| 3 | gradeid | gradeid | gradeid | varchar2(32) | √ |
| 4 | gradeitemname | gradeitemname | gradeitemname | varchar2(150) | √ |
| 5 | gradeitemremark | gradeitemremark | gradeitemremark | varchar2(600) |
| 6 | lowerlimit | lowerlimit | lowerlimit | number(16, 4) |
| 7 | ordernum | ordernum | ordernum | number(38, 0) |
| 8 | standardscore | standardscore | standardscore | number(16, 4) |
| 9 | tenantid | tenantid | tenantid | varchar2(32) |
| 10 | upperlimit | upperlimit | upperlimit | number(16, 4) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | date |  |  | sysdate |