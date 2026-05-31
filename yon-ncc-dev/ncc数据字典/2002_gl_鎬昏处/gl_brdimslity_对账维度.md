# |<<

**对账维度 (gl_brdimslity / nc.vo.gl.busirecon.setting.BRdimslityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brmapping | 对象标识 | pk_brmapping | char(20) | √ | 主键 (UFID) |
| 2 | linenum | 序号 | linenum | int |  | 整数 (Integer) |
| 3 | accitemvalue | 辅助核算 | accitemvalue | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 4 | pk_brrelation | 业务系统档案 | pk_brrelation | varchar(36) |  | 对照关系 (brrelation) |
| 5 | pk_classid | 系统档案classid | pk_classid | varchar(50) |  | 字符串 (String) |