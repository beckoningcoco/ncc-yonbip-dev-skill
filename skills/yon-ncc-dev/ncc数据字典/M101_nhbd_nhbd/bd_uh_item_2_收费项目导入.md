# |<<

**收费项目导入 (bd_uh_item_2 / nc.vo.srvitem.dataio.ItemVO2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 项目主键 | pk_item | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) | √ | 字符串 (String) |
| 4 | pk_measdoc | 单位 | pk_measdoc | varchar(20) | √ | 计量单位 (measdoc) |
| 5 | spec | 规格 | spec | varchar(50) |  | 字符串 (String) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | wbcode | 五笔码 | wbcode | varchar(50) |  | 字符串 (String) |
| 8 | othcode | 其他码 | othcode | varchar(50) |  | 字符串 (String) |
| 9 | pk_price | 定价模式 | pk_price | varchar(20) | √ | 定价模式 (PriceModeVO) |
| 10 | price | 参考价格 | price | decimal(28, 8) | √ | 数值 (UFDouble) |
| 11 | pk_srvcate | 服务分类 | pk_srvcate | varchar(20) | √ | 医疗服务基础分类 (SrvCateVO) |
| 12 | pk_chcate | 病案分类 | pk_chcate | varchar(20) |  | 病案分类(自定义档案) (Defdoc-030801) |
| 13 | note | 收费项目备注 | note | varchar(50) |  | 字符串 (String) |
| 14 | flag_set | 组套标志默认N | flag_set | varchar(50) |  | 字符串 (String) | N |
| 15 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 16 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 17 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 18 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 19 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 20 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 21 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 22 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 23 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 24 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |