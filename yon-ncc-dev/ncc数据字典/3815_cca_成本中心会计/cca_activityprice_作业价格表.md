# |<<

**作业价格表 (cca_activityprice / nc.vo.cca.activityprice.ActivitypriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1271.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_activityprice | 作业价格表主键 | pk_activityprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 3 | pk_accountbook | 核算账簿 | pk_accountbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pricetype | 价格类型 | pricetype | int |  | 作业价格类型 (ActPriceTypeEnum) |  | 1=计划价; |