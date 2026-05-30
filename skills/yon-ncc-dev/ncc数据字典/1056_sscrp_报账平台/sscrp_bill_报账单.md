# |<<

**报账单 (sscrp_bill / nc.vo.sscrp.rpbill.RPBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill | 主键 | pk_bill | char(20) | √ | 主键 (UFID) |
| 2 | busiid | 来源单据主键 | busiid | varchar(20) |  | 字符串 (String) |
| 3 | billtypecode | 单据类型 | billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 5 | transtypecode | 交易类型编码 | transtypecode | varchar(101) |  | 字符串 (String) |
| 6 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 7 | operator | 关注人 | operator | varchar(20) |  | 用户 (user) |
| 8 | billno | 单据编号 | billno | varchar(200) |  | 字符串 (String) |
| 9 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 10 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | remark | 备注 | remark | varchar(1000) |  | 字符串 (String) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 14 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | rescan | 影像补扫标识 | rescan | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | orgamount | 组织本币 | orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | defitem11 | 自定义项11 | defitem11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | defitem12 | 自定义项12 | defitem12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | defitem13 | 自定义项13 | defitem13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | defitem14 | 自定义项14 | defitem14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | defitem15 | 自定义项15 | defitem15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | defitem16 | 自定义项16 | defitem16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | defitem17 | 自定义项17 | defitem17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | defitem18 | 自定义项18 | defitem18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | defitem19 | 自定义项19 | defitem19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | defitem20 | 自定义项20 | defitem20 | varchar(101) |  | 自定义项 (Custom) |
| 37 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 38 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 39 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 40 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |