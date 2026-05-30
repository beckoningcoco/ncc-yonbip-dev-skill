# |<<

**议题信息 (scapto_arrangetopic / nc.vo.scapto.premeetingmanage.meetingarrange.MeetingArrangeTopicVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5111.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arrangetopic | 主键 | pk_arrangetopic | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 3 | vtopiccode | 议题编码 | vtopiccode | varchar(50) |  | 字符串 (String) |
| 4 | vtopicname | 议题名称 | vtopicname | varchar(1024) |  | 字符串 (String) |
| 5 | vapplycode | 议题申报流水号 | vapplycode | varchar(50) |  | 字符串 (String) |
| 6 | vreporter | 汇报人 | vreporter | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | vpresent | 列席人 | vpresent | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vmemo | 备注 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 9 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 10 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 11 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 19 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 20 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 21 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 22 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 23 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 24 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 25 | tsrcts | 来源单据ts | tsrcts | char(19) |  | 日期时间 (UFDateTime) |
| 26 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |