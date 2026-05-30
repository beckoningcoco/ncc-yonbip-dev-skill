# |<<

**信用额度审批单子实体 (so_creditaudit_b / nc.vo.credit.creditaudit.entity.CreditAuditBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5394.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccreditauditbid | 信用额度审批单明细 | ccreditauditbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) | √ | 组织_信用控制域 (creditctlregion) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) | √ | 日期时间 (UFDateTime) |
| 4 | climittypeid | 额度类型 | climittypeid | varchar(20) | √ | 额度类型表 (so_limittype) |
| 5 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | csaledeptid | 销售部门 | csaledeptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | ccustid | 客户 | ccustid | varchar(20) |  | 客户基本信息 (customer) |
| 9 | climitlevel | 信用等级 | climitlevel | varchar(20) |  | 信用等级(自定义档案) (Defdoc-BD003_0xx) |
| 10 | ccurrencyid | 币种 | ccurrencyid | varchar(20) | √ | 币种 (currtype) |
| 11 | norglimitmny | 原信用额度 | norglimitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nlimitmny | 信用额度 | nlimitmny | decimal(28, 8) | √ | 数值 (UFDouble) |
| 13 | dfromdate | 有效期从 | dfromdate | char(19) |  | 日期时间 (UFDateTime) |
| 14 | dtodate | 有效期至 | dtodate | char(19) |  | 日期时间 (UFDateTime) |
| 15 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 16 | ccreditid | 信用额度行记录ID | ccreditid | varchar(20) |  | 字符串 (String) |
| 17 | bupdateflag | 是否修改标志 | bupdateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | ncredlimitmny | 信用额度原始信用额度 | ncredlimitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ncredcurrencyid | 信用额度原始币种 | ncredcurrencyid | varchar(20) |  | 币种 (currtype) |
| 20 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 21 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |