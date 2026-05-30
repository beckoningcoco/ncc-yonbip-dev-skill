# |<<

**信用额度 (so_creditamount / nc.vo.credit.creditamount.entity.CreditAmountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5392.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccreditamountid | 信用额度实体 | ccreditamountid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 4 | climittypeid | 额度类型 | climittypeid | varchar(20) |  | 额度类型表 (so_limittype) |
| 5 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | bcdownsaleflag | 包含下级销售组织 | bcdownsaleflag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 7 | csaledeptid | 销售部门 | csaledeptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 10 | climitlevelid | 信用等级 | climitlevelid | varchar(20) |  | 信用等级(自定义档案) (Defdoc-BD003_0xx) |
| 11 | ccurrencyid | 币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 12 | nlimitmny | 信用额度 | nlimitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | dfromdate | 有效期从 | dfromdate | char(19) |  | 日期时间 (UFDateTime) |
| 14 | dtodate | 有效期至 | dtodate | char(19) |  | 日期时间 (UFDateTime) |
| 15 | vbillcode | 审批单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 16 | capplyerid | 申请人 | capplyerid | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | taudittime | 审批日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 18 | ccreditauditid | 信用额度审批单主键 | ccreditauditid | varchar(20) |  | 字符串 (String) |