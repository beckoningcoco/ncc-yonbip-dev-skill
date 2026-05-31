# |<<

**临床路径_检验项目表 (uh_cn_cp_stage_item_lis / com.yonyou.yh.nhis.cn.cp.vo.CpLisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5981.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lis | 检验项目ID | pk_lis | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 字符串 (String) |
| 4 | pk_item | 项目id | pk_item | varchar(20) | √ | 临床路径_项目表 (uhcncpstageitem) |
| 5 | pk_srvtype | 项目分类编码 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 6 | srvtype_name | 项目分类名称 | srvtype_name | varchar(50) |  | 字符串 (String) |
| 7 | code_lis | 检验项目编码 | code_lis | varchar(20) |  | 字符串 (String) |
| 8 | name_lis | 检验项目名称 | name_lis | varchar(256) |  | 字符串 (String) |
| 9 | dt_samptype | 标本类型 | dt_samptype | varchar(20) |  | 字符串 (String) |
| 10 | dt_contype | 试管类型 | dt_contype | varchar(20) |  | 字符串 (String) |
| 11 | dt_colltype | 采集方法 | dt_colltype | varchar(30) |  | 字符串 (String) |
| 12 | amount | 数量 | amount | varchar(20) |  | 字符串 (String) |
| 13 | pk_dept_coll | 样本采集科室 | pk_dept_coll | varchar(20) |  | 字符串 (String) |
| 14 | purpose_lis | 检验目的 | purpose_lis | varchar(256) |  | 字符串 (String) |
| 15 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 16 | type_ord | 医嘱类型 | type_ord | varchar(50) |  | 字符串 (String) |
| 17 | cate_ord | attrDisplayName | cate_ord | varchar(50) |  | 字符串 (String) |
| 18 | pk_lis_dit | 检验服务主键 | pk_lis_dit | varchar(50) |  | 字符串 (String) |
| 19 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |