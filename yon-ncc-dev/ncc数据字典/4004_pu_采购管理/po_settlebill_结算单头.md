# |<<

**结算单头 (po_settlebill / nc.vo.pu.m27.entity.SettleBillHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4634.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlebill | 结算单 | pk_settlebill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 6 | bvirtualsettle | 是否虚拟发票的结算 | bvirtualsettle | char(1) |  | 布尔类型 (UFBoolean) | N |
| 7 | vbillcode | 结算单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dbilldate | 结算日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 9 | btoia | 已传存货 | btoia | char(1) |  | 布尔类型 (UFBoolean) | N |
| 10 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) | 0 |
| 11 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 12 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 13 | fsettletype | 结算单据类型 | fsettletype | int |  | 结算单据类型 (结算单据类型) |  | 0=采购结算; |