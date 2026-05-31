# |<<

**物料基本分类 (bd_marbasclass / nc.vo.bd.material.marbasclass.MarBasClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marbasclass | 物料基本分类主键 | pk_marbasclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 物料基本分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 物料基本分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_parent | 上级物料分类 | pk_parent | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | avgprice | 平均单价 | avgprice | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 8 | averagecost | 平均成本 | averagecost | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 9 | averagepurahead | 平均采购提前期 | averagepurahead | int |  | 整数 (Integer) |  | [0 , ] |
| 10 | averagemmahead | 平均生产提前期 | averagemmahead | int |  | 整数 (Integer) |  | [0 , ] |
| 11 | pk_marasstframe | 辅助属性结构 | pk_marasstframe | varchar(20) |  | 辅助属性结构 (marasstframe) |
| 12 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |