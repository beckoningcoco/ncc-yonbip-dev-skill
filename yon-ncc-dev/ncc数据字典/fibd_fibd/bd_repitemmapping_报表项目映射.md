# |<<

**报表项目映射 (bd_repitemmapping / nc.vo.bd.reportitemmapping.RepItemMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/955.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repmapping | 报表项目映射主键 | pk_repmapping | char(20) | √ | 主键 (UFID) |
| 2 | pk_reportsystem | 报表项目体系 | pk_reportsystem | varchar(20) | √ | 报表项目体系 (reportsystem) |
| 3 | pk_accsystem | 会计科目体系 | pk_accsystem | varchar(20) |  | 科目体系 (accsystem) |
| 4 | doctype | 映射档案类型 | doctype | int |  | 映射档案类型 (DocTypeEnum) |  | 1=会计科目; |