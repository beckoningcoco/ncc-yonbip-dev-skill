# |<<

**超账期检查提示信息 (accountcheckmessage / nc.vo.credit.accountcheck.entity.AccountCheckMessage)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主属性 | id | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 3 | climittypeid | 额度类型 | climittypeid | varchar(20) |  | 额度类型表 (so_limittype) |
| 4 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 5 | fcontroltypeflag | 控制方式 | fcontroltypeflag | int |  | 控制方式 (fcontroltypeflag) |  | 0=严格控制; |