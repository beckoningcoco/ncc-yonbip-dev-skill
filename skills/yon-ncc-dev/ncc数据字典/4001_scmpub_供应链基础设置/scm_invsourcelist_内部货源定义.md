# |<<

**内部货源定义 (scm_invsourcelist / nc.vo.scmf.pu.invsource.entity.InvSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invsource | 内部货源定义 | pk_invsource | char(20) | √ | 主键 (UFID) |
| 2 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | pk_stockorgreq | 需求库存组织 | pk_stockorgreq | varchar(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_stockorgsup | 供货库存组织 | pk_stockorgsup | varchar(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 5 | vmarcode | 物料分类编码 | vmarcode | varchar(40) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织其它_用户可管理的集团 (useradmingroup) |
| 7 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织其它_用户主组织 (usermainorg) |
| 8 | pk_stockreq | 需求库存组织仓库 | pk_stockreq | varchar(20) |  | 仓库 (stordoc) |
| 9 | pk_stocksup | 供货库存组织仓库 | pk_stocksup | varchar(20) |  | 仓库 (stordoc) |
| 10 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |