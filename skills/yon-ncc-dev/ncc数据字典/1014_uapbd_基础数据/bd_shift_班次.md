# |<<

**班次 (bd_shift / nc.vo.bd.shift.ShiftVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/965.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_shift | 班次主键 | pk_shift | char(20) | √ | 主键 (UFID) |
| 2 | pk_shifttype | 班次类别主键 | pk_shifttype | varchar(20) |  | 班次类别 (bdshifttype) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |