# |<<

**维修标准 (rm_maintainstd / nc.vo.ampub.maintainstd.MaintainStdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_maintainstd | 维修标准主键 | pk_maintainstd | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 租出组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | maintainstd_code | 维修标准编码 | maintainstd_code | varchar(40) |  | 字符串 (String) |
| 5 | maintainstd_name | 维修标准名称 | maintainstd_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | mateinnercode | 物料内码 | mateinnercode | varchar(50) |  | 字符串 (String) |
| 9 | pk_unit | 报价单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |