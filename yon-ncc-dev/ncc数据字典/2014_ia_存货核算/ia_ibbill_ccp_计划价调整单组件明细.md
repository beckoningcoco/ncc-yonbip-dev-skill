# |<<

**计划价调整单组件明细 (ia_ibbill_ccp / nc.vo.ia.mib.entity.IBItemCcpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2834.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cibbillccpid | 计划价调整成本组件表主键 | cibbillccpid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 单据主表主键 | cbillid | varchar(20) |  | 主键 (UFID) |
| 3 | cbill_bid | 单据子表主键 | cbill_bid | varchar(20) |  | 主键 (UFID) |
| 4 | ccostcompid | 成本组件 | ccostcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 5 | nplanedprice | 调整后计划单价 | nplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | noriginplanedprice | 调整前计划单价 | noriginplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nupplanedprice | 上层调整后计划单价 | nupplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nuporiginplanedprice | 上层调整前计划单价 | nuporiginplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |