# |<<

**单据信用查询 (creditqueryinfo / nc.vo.credit.billcreditquery.BillCreditQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 信用查询 | id | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 3 | climittypeid | 额度类型 | climittypeid | varchar(20) |  | 额度类型表 (so_limittype) |
| 4 | fvoccupiedflag | 信用占用开始时点 | fvoccupiedflag | int |  | 信用占用开始时点 (fvoccupiedflag) |  | 0=订单保存; |