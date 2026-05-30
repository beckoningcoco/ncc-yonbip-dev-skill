# |<<

**服务项目组套 (bd_uh_item_set / com.yonyou.nhis.bd.pub2.item.vo.ItemSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itemset | 服务套主键 | pk_itemset | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_item | 服务项目 | pk_item | char(20) |  | 主键 (UFID) |
| 5 | pk_item_child | 包括服务项目 | pk_item_child | char(20) |  | 主键 (UFID) |
| 6 | quan | 数量 | quan | int |  | 整数 (Integer) |