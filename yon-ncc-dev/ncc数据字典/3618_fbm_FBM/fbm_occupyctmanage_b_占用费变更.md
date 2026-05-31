# |<<

**占用费变更 (fbm_occupyctmanage_b / nc.vo.pfbm.occupyctmanage.OccupyctmanageBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2140.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occupyctmanage_b | 主键 | pk_occupyctmanage_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_occupyctmanage | 占用费管理主键 | pk_occupyctmanage | char(20) |  | 主键 (UFID) |
| 3 | effectdate | 起效日期 | effectdate | char(19) |  | 日期 (UFDate) |
| 4 | reviser | 修订人 | reviser | varchar(20) |  | 用户 (user) |
| 5 | versionno | 版本 | versionno | int |  | 整数 (Integer) |
| 6 | note | 备注 | note | varchar(100) |  | 字符串 (String) |
| 7 | yrate | 年利率 | yrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | mrate | 月利率 | mrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | drate | 日利率 | drate | decimal(28, 8) |  | 数值 (UFDouble) |