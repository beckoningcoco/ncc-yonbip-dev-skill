# |<<

**临床路径_项目记录表 (uh_cn_cp_stage_item_ex / com.yonyou.yh.nhis.cn.cp.vo.CNCpStageItemExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item_ex | 主键 | pk_item_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_stage_ex | 阶段记录表中的id | pk_stage_ex | char(20) | √ | 主键 (UFID) |
| 5 | pk_item | 路径制定中项目表中的项目id | pk_item | char(20) |  | 主键 (UFID) |
| 6 | name_item | 路径制定中的项目名称 | name_item | varchar(200) |  | 字符串 (String) |