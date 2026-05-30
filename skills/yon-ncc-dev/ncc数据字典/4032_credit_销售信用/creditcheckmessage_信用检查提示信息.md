# |<<

**信用检查提示信息 (creditcheckmessage / nc.vo.credit.creditcheck.entity.CreditCheckMessage)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主属性 | id | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 3 | ccurrency | 币种 | ccurrency | varchar(20) |  | 币种 (currtype) |
| 4 | climittypeid | 额度类型 | climittypeid | varchar(20) |  | 额度类型表 (so_limittype) |
| 5 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | csaledeptid | 销售部门 | csaledeptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 9 | fvoccupiedflag | 信用占用开始时点 | fvoccupiedflag | int |  | 信用占用开始时点 (fvoccupiedflag) |  | 0=订单保存; |