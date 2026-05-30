# |<<

**物品存储_库单_关联 (uh_pd_st_rl / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdStRlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6156.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdstrl | 物品存储库单关联主键 | pk_pdstrl | char(20) | √ | 主键 (UFID) |
| 2 | code | 关联编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | name | 关联名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | pk_pdst | 物品库单 | pk_pdst | varchar(20) |  | 物料库存信息 (materialstock) |
| 8 | dt_role_pdstrl | 角色 | dt_role_pdstrl | varchar(50) |  | 字符串 (String) |