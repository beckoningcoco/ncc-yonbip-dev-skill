# |<<

**模板定义镜像 (fip_templaterow / nc.vo.fip.transtemplate.TemplateRowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templaterow | 对象标识 | pk_templaterow | char(20) | √ | 主键 (UFID) |
| 2 | desentity | 目标实体 | desentity | varchar(36) |  | 实体 (entity) |
| 3 | rowindex | 顺序行号 | rowindex | int |  | 整数 (Integer) |
| 4 | pk_transtemplate | 所属模板 | pk_transtemplate | varchar(20) |  | 元数据转换模板 (transtemplate) |
| 5 | fk_templaterow | 所属分组 | fk_templaterow | varchar(20) |  | 模板定义镜像 (templatecontent_tmp) |