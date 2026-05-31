# |<<

**分货单主实体 (to_allot / nc.vo.to.m5j.entity.AllotHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 分货单主表主键 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | pk_org | 发货库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 发货库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | ntotalastnum | 业务单位总数量 | ntotalastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (AllotBillStatus) |  | 1=自由; |