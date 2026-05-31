# |<<

**收费项目组套 (bd_uh_item_set_2 / nc.vo.srvitem.dataio.ItemSetVO2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1055.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itemset | 组套主键 | pk_itemset | char(20) | √ | 主键 (UFID) |
| 2 | pk_item_child | 子项目 | pk_item_child | varchar(20) | √ | 医疗服务收费项目字典 (bduhitem) |
| 3 | quan | 数量 | quan | int |  | 整数 (Integer) |