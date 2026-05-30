# |<<

**协同单位子表 (gl_reconcileunitsub / nc.vo.gl.reconcileunit.reconcileunitsub)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcileunitsub | 主键 | pk_reconcileunitsub | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码规则 | code | char(60) |  | 主键 (UFID) |
| 3 | anotherorgbook | 对应主体帐簿 | anotherorgbook | char(60) |  | 主键 (UFID) |
| 4 | pk_reconcileunit | 主表主键 | pk_reconcileunit | char(20) |  | 主键 (UFID) |