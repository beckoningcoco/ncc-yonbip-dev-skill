# |<<

**分摊方法定义主表 (cost_spmethod_h / nc.vo.hrpco.spmethod.SpmethodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1627.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptspagency_h | 主键 | pk_deptspagency_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_codept | 科室编码 | pk_codept | varchar(20) |  | 科室档案 (CodepartVO) |
| 3 | vmethod | 分摊方法 | vmethod | varchar(20) |  | 分摊方法 (Spmothodenum) |  | 1=按总额分摊; |