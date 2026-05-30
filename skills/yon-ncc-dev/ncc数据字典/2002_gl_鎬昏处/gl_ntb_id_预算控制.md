# |<<

**预算控制 (gl_ntb_id / nc.vo.gl.ntb_id.ntb_id)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2440.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_ctrlschm | 控制方案 | pk_ctrlschm | char(20) |  | 主键 (UFID) |
| 3 | rundatay | 原币 | rundatay | decimal(20, 8) |  | 数值 (UFDouble) |
| 4 | rundataf | 辅币 | rundataf | decimal(20, 8) |  | 数值 (UFDouble) |
| 5 | rundatab | 本币 | rundatab | decimal(20, 8) |  | 数值 (UFDouble) |
| 6 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |