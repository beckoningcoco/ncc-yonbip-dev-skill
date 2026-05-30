# |<<

**坏账比率 (gl_verrate / nc.vo.gl.verRate.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2503.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verrate | 比率标识 | pk_verrate | char(20) | √ | 主键 (UFID) |
| 2 | propertyid | 账期 | propertyid | int |  | 整数 (Integer) |
| 3 | rate | 比率 | rate | decimal(11, 8) |  | 数值 (UFDouble) |
| 4 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 5 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |