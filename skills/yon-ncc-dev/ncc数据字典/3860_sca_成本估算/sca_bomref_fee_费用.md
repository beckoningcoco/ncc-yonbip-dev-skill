# |<<

**费用 (sca_bomref_fee / nc.vo.sca.costbom.entity.FeeRefBuildVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkfee | 费用 | pkfee | char(20) | √ | 主键 (UFID) |
| 2 | pkmartacvt | 材料作业 | pkmartacvt | char(20) |  | 主键 (UFID) |
| 3 | factorid | 核算要素 | factorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 4 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 5 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | feerate | 费率 | feerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | cactivity | 作业 | cactivity | varchar(20) |  | 作业档案 (bd_activity) |
| 8 | ipriceresourcenum | 价格来源数字 | ipriceresourcenum | varchar(50) |  | 字符串 (String) |