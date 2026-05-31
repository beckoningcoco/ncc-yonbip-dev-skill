# |<<

**临床路径_诊疗项目明细表 (uh_cn_cp_stage_item_clin / com.yonyou.yh.nhis.cn.cp.vo.CpClincVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5978.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clin | 项目明细ID | pk_clin | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 字符串 (String) |
| 4 | pk_item | 项目ID | pk_item | varchar(20) | √ | 临床路径_项目表 (uhcncpstageitem) |
| 5 | desc_clin | 诊疗项目明细描述 | desc_clin | varchar(1000) |  | 字符串 (String) |
| 6 | code_case | 病例编码 | code_case | varchar(20) |  | 字符串 (String) |
| 7 | day_or_stage | 每日执行(1)or阶段执(2) | day_or_stage | int |  | 整数 (Integer) |
| 8 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |