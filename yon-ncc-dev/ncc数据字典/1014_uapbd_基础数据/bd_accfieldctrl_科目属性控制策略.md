# |<<

**科目属性控制策略 (bd_accfieldctrl / nc.vo.bd.accfieldctrlstrategy.AccFieldCtrlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/304.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accfieldctrl | 主键 | pk_accfieldctrl | char(20) | √ | 主键 (UFID) |
| 2 | pk_accfieldcttemp | 属性控制模板 | pk_accfieldcttemp | varchar(0) |  | 科目属性控制模板 (AccFieldCtrlTempVO) |
| 3 | ctrlstrategy | 控制策略 | ctrlstrategy | int |  | 控制策略 (ctrlstrategy) |  | 0=控制; |