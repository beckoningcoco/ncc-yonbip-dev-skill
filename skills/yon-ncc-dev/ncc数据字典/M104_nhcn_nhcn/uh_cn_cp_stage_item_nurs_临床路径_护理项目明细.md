# |<<

**临床路径_护理项目明细 (uh_cn_cp_stage_item_nurs / com.yonyou.yh.nhis.cn.cp.vo.CpNursVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5983.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nurs | 护理项目ID | pk_nurs | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_item | 项目id | pk_item | varchar(20) | √ | 临床路径_项目表 (uhcncpstageitem) |
| 5 | desc_nurs | 护理项目明细描述 | desc_nurs | varchar(1000) |  | 字符串 (String) |
| 6 | code_case | 病历编码 | code_case | varchar(20) |  | 字符串 (String) |
| 7 | day_or_stage | 是否每日执行 | day_or_stage | int |  | 整数 (Integer) |
| 8 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |