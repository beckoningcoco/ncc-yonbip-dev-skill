# |<<

**临床路径_项目表 (uh_cn_cp_stage_item / com.yonyou.yh.nhis.cn.cp.vo.CpItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5977.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 项目主键 | pk_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_stage | 阶段ID | pk_stage | char(20) | √ | 主键 (UFID) |
| 5 | name_item | 项目名称 | name_item | varchar(200) |  | 字符串 (String) |
| 6 | type_action | 操作类别,1 主要诊疗工作2重点医嘱 3主要护理工作 | type_action | int |  | 整数 (Integer) |
| 7 | type_item | 项目类别 | type_item | int |  | 整数 (Integer) |
| 8 | prop_exe | 项目执行属性（1必选 2可选 3必要时） | prop_exe | int |  | 整数 (Integer) |
| 9 | prop_select | 项目选择属性（1单选 2多选） | prop_select | int |  | 整数 (Integer) |
| 10 | type_ord | 医嘱类型：1长期医嘱 2临时医嘱 | type_ord | int |  | 整数 (Integer) |
| 11 | item_sn | 项目排序号 | item_sn | varchar(50) |  | 字符串 (String) |
| 12 | print_show | 打印显示 | print_show | varchar(50) |  | 字符串 (String) |