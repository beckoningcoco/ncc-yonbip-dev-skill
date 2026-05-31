# |<<

**检验品形态 (qc_checkshape / nc.vo.qc.checkshape.entity.CheckShapeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkshape | 检验品形态主键 | pk_checkshape | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vshapecode | 检验品形态编码 | vshapecode | varchar(50) |  | 字符串 (String) |
| 4 | vshapename | 检验品形态名称 | vshapename | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |