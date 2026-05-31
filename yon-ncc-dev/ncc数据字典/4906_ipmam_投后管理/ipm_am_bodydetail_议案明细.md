# |<<

**议案明细 (ipm_am_bodydetail / nc.vo.ipmam.summary.BodyDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3155.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bodydetail | 议案明细主键 | pk_bodydetail | char(20) | √ | 主键 (UFID) |
| 2 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 3 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 4 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 5 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 6 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 7 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 8 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 9 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 10 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 11 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 12 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 13 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 14 | csrcbid | 来源单据表体主键 | csrcbid | char(20) |  | 主键 (UFID) |
| 15 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 16 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 17 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 18 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 19 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 20 | cfirstbid | 源头单据表体主键 | cfirstbid | char(20) |  | 主键 (UFID) |
| 21 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 22 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 23 | vmemo | 备注 | vmemo | varchar(60) |  | 字符串 (String) |
| 24 | vmeetname | 议案名称 | vmeetname | varchar(200) |  | 字符串 (String) |
| 25 | vmeetcontent | 议案内容概述 | vmeetcontent | varchar(200) |  | 字符串 (String) |
| 26 | bisrelatedtrans | 是否涉及关联交易 | bisrelatedtrans | varchar(50) |  | 下拉布尔 (IPMYESNOEnum) |  | Y=是; |