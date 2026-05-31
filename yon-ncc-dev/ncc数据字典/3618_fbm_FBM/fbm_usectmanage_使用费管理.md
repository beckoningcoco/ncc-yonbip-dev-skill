# |<<

**使用费管理 (fbm_usectmanage / nc.vo.pfbm.usectmanage.UsectmanageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usectmanage | 使用费管理主键 | pk_usectmanage | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 4 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 5 | inputdate | 手工录入日期 | inputdate | char(19) |  | 日期 (UFDate) |
| 6 | effectdate | 生效日期 | effectdate | char(19) |  | 日期 (UFDate) |
| 7 | unitrate | 单位使用费率 | unitrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | sharerate | 共享适用费率 | sharerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | version | 版本 | version | int |  | 整数 (Integer) |
| 10 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 是否启用 (enablestate) | 2 | 2=已启用; |