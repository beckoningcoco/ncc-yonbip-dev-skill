# |<<

**议案明细 (ipm_am_meetdetail / nc.vo.ipmam.meeting.MeetDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetdetail | 议案明细主键 | pk_meetdetail | char(20) | √ | 主键 (UFID) |
| 2 | vmeetname | 议案名称 | vmeetname | varchar(200) |  | 字符串 (String) |
| 3 | vmeetcontent | 议案内容概述 | vmeetcontent | varchar(200) |  | 字符串 (String) |
| 4 | bisholderapply | 是否股东提出 | bisholderapply | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | vholdername | 股东姓名 | vholdername | varchar(50) |  | 字符串 (String) |
| 6 | vholderrate | 股东占股比例(%) | vholderrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | vmemo | 备注说明 | vmemo | varchar(60) |  | 字符串 (String) |
| 8 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 9 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 10 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 11 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 17 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 18 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 19 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 20 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 21 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 22 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 23 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 24 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 25 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 26 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 27 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 28 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 29 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |