# |<<

**利率变更 (fbm_usectmanage_b / nc.vo.pfbm.usectmanage.UsectmanageBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | revisedate | 起效日期 | revisedate | char(19) |  | 日期 (UFDate) |
| 2 | reviser | 修订人 | reviser | varchar(20) |  | 用户 (user) |
| 3 | versionno | 版本 | versionno | int |  | 整数 (Integer) |
| 4 | interestflag | 计息标识 | interestflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | note | 备注 | note | varchar(100) |  | 字符串 (String) |
| 6 | unitrate | 单位使用费率 | unitrate | decimal(28, 4) |  | 数值 (UFDouble) |
| 7 | sharerate | 共享使用费率 | sharerate | decimal(28, 4) |  | 数值 (UFDouble) |
| 8 | drate | 日利率 | drate | decimal(28, 4) |  | 数值 (UFDouble) |