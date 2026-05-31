# |<<

**分摊对象 (gl_appitem / nc.vo.gl.apportion.AppitemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appitem | 分摊对象标识 | pk_appitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_accassitem | 分摊对象 | pk_accassitem | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | pk_doc | 对象值 | pk_doc | varchar(20) |  | 常用摘要 (summary) |
| 4 | linenum | 序号 | linenum | int |  | 整数 (Integer) |