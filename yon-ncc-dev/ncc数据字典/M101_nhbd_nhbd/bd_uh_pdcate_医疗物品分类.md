# |<<

**医疗物品分类 (bd_uh_pdcate / com.yonyou.yh.nhis.bd.pdcate.vo.PdCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1075.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdcate | 物品分类主键 | pk_pdcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 物品分类编码 | code | varchar(50) | √ | 字符串 (String) |
| 5 | name | 物品分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | dt_pdtype | 物品分类类型编码 | dt_pdtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_pdtype | 物品分类类型 | pk_pdtype | varchar(20) |  | 物品类型(自定义档案) (Defdoc-080001) |
| 8 | pk_father | 上级分类 | pk_father | varchar(20) |  | 医疗物品分类 (PdCateVO) |
| 9 | mnecode | 助记符 | mnecode | varchar(50) | √ | 字符串 (String) |
| 10 | eu_pricemode | 默认零售价计算方式 | eu_pricemode | int |  | 默认零售价计算方式 (pricemodeenum) |  | 0=固定价格; |