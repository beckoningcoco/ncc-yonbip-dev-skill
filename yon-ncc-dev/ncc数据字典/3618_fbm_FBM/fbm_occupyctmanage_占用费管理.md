# |<<

**占用费管理 (fbm_occupyctmanage / nc.vo.pfbm.occupyctmanage.OccupyctmanageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occupyctmanage | 占用费管理主键 | pk_occupyctmanage | char(20) | √ | 主键 (UFID) |
| 2 | code | 费率编码 | code | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 5 | yrate | 年利率 | yrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | inputdate | 手工录入日期 | inputdate | char(19) |  | 日期 (UFDate) |
| 7 | effectdate | 生效日期 | effectdate | char(19) |  | 日期 (UFDate) |
| 8 | mrate | 月利率 | mrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | dratenum | 日利率天数 | dratenum | int |  | 利率天数 (dratenum) |  | 360=360天; |