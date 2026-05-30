# |<<

**临床路径_检查项目表 (uh_cn_cp_stage_item_ris / com.yonyou.yh.nhis.cn.cp.vo.CpRisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ris | 检查项目ID | pk_ris | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_item | 项目ID | pk_item | varchar(20) | √ | 临床路径_项目表 (uhcncpstageitem) |
| 5 | pk_srvtype | 项目分类编码 | pk_srvtype | varchar(20) |  | 字符串 (String) |
| 6 | srvtype_name | 项目分类名称 | srvtype_name | varchar(50) |  | 字符串 (String) |
| 7 | code_ris | 检查项目编码 | code_ris | varchar(20) |  | 字符串 (String) |
| 8 | name_ris | 检查项目名称 | name_ris | varchar(256) |  | 字符串 (String) |
| 9 | code_body | 检查部位编码 | code_body | varchar(1000) |  | 字符串 (String) |
| 10 | name_body | 检查部位（组织） | name_body | varchar(256) |  | 字符串 (String) |
| 11 | amount | 数量 | amount | varchar(20) |  | 字符串 (String) |
| 12 | pk_org_exec | 医疗服务对应的执行机构 | pk_org_exec | varchar(20) |  | 字符串 (String) |
| 13 | pk_dept_exec | 医疗服务对应的执行科室 | pk_dept_exec | varchar(50) |  | 字符串 (String) |
| 14 | exampurp | 检查目的与要求 | exampurp | varchar(4000) |  | 字符串 (String) |
| 15 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 16 | type_ord | 医嘱类型 | type_ord | varchar(50) |  | 字符串 (String) |
| 17 | cate_ord | 医嘱类别 | cate_ord | varchar(50) |  | 字符串 (String) |
| 18 | pk_ris_dit | 检查服务字典 | pk_ris_dit | varchar(50) |  | 字符串 (String) |
| 19 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |