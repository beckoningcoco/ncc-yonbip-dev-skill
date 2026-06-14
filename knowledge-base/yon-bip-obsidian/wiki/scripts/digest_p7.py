"""
批量消化 BIP 元数据 JSON 到知识库 markdown 页面。
Phase 7: aa/price 价格体系 + cpubase 供应品类 + business.rule 规则引擎
"""
import json, os, glob, re, sys
from datetime import date

JSON_DIR = r"D:\yon-bip-obsidian\yon-bip-obsidian\wiki\metadata-json"
ENTITIES_DIR = r"D:\yon-bip-obsidian\yon-bip-obsidian\wiki\entities"
today = date.today().strftime("%Y-%m-%d")

# Reuse functions from digest_entities.py
exec(open("digest_entities.py", "r", encoding="utf-8").read().split("def main():")[0] + """
def main():
    existing_uris = get_existing_uris()
    print(f"已消化实体: {len(existing_uris)} 个")

    target_files = [
        "metadata_aa_querylog_BiPriceLogVO.json",
        "metadata_cpubase_supplycategory_Supplycategory.json",
        "metadata_cpubase_supplycategory_SupplycategoryVendor.json",
        "metadata_cpubase_supplycategory_SupplycategoryMaterial.json",
        "metadata_yc_pricecenter_AdjustPrice.json",
        "metadata_aa_pricecenter_BiPriceEntity.json",
        "metadata_aa_priceformula_PriceFactorAdjust.json",
        "metadata_aa_priceformula_PriceFactor.json",
        "metadata_aa_priceformula_BillFactorMapping.json",
        "metadata_aa_qualitypricestandard_PriceStandard.json",
        "metadata_aa_priceformula_PriceFactorClass.json",
        "metadata_aa_qualitypricehistory_PriceHisLibHeadEntity.json",
        "metadata_aa_dynamicpricescheme_PriceScheme.json",
        "metadata_aa_pricetype_PriceType.json",
        "metadata_aa_pricestrategy_PriceStrategy.json",
        "metadata_aa_pricetype_PriceOrder.json",
        "metadata_aa_costitem_CostItem.json",
        "metadata_cpubase_quota_QuotaAgreeVO.json",
        "metadata_cpubase_quota_GoodsStrategyVO.json",
        "metadata_cpubase_quota_GoodsStrategyChm.json",
        "metadata_cpubase_quota_GoodsStrategyChd.json",
        "metadata_cpubase_quota_QuotaAgreeChd.json",
        "metadata_cpubase_quota_QuotaAgreeChm.json",
        "metadata_cpubase_quota_QuotaAgreeAllotChd.json",
        "metadata_aa_ct_BizScene.json",
        "metadata_aa_quotation_BiQuotationHead.json",
        "metadata_cpubase_gdscenter_Gdsource.json",
        "metadata_cpubase_supplycategoryapplication_SupplycategoryApplicationVO.json",
        "metadata_business_rule_BusinessRuleTag.json",
        "metadata_cpubase_supplycategory_SupplycategoryPurchaseClass.json",
        "metadata_business_rule_BusinessRuleMatchMapping.json",
        "metadata_business_rule_BusinessRuleSolution.json",
        "metadata_cpubase_supplycategoryapplication_SupplycategoryApplicationDetailDefineNew.json",
        "metadata_cpubase_supplycategoryapplication_SupplycategoryApplicationDetailDefineCharacter.json",
        "metadata_cpubase_supplycategory_SupplycategoryMaterialClass.json",
        "metadata_cpubase_supplycategory_SupplycategoryCharacteristicsDefine.json",
        "metadata_business_rule_BusinessRuleDimensionGroup.json",
        "metadata_cpubase_supplycategoryapplication_SupplycategoryApplicationCharacteristicsDefine.json",
        "metadata_cpubase_supplycategoryapplication_SupplycategoryApplicationDefineNew.json",
        "metadata_cpubase_supplycategory_SupplycategorySkuSensitive.json",
        "metadata_aa_pricecenter_BiMaterialPriceTrend.json",
        "metadata_business_rule_BusinessRuleControlMethod.json",
        "metadata_business_rule_BusinessRuleControlStrategyMapping.json",
        "metadata_business_rule_BusinessRuleOpportunity.json",
        "metadata_aa_costitem_CostItemTemplate.json",
        "metadata_aa_costquote_CpuCostPricing.json",
        "metadata_cpubase_quota_QuotaAgreeTemplateVO.json",
        "metadata_cpubase_quota_QuotaAgreeTempBiz.json",
    ]

    all_new_uris = set()
    generated = 0

    for fname in target_files:
        fpath = os.path.join(JSON_DIR, fname)
        if not os.path.exists(fpath):
            print(f"[SKIP] 文件不存在: {fname}")
            continue

        print(f"[PROCESS] {fname}...")
        data = load_json(fpath)
        inner = data.get("data", {}).get("data", {})

        uri = inner.get("uri", "")
        if not uri:
            print(f"  [WARN] 无 uri，跳过")
            continue

        summary = extract_summary(data)
        attrs = extract_attrs(data)
        assocs = extract_assocs(data)
        suppliers = extract_suppliers(data)

        print(f"  URI: {uri} | 显示名: {summary['displayName']} | 表: {summary['tableName']} | 属性: {len(attrs)} | 关联: {len(assocs)}")

        app_code = summary.get('applicationCode', '')
        md = generate_frontmatter(uri, summary, app_code)
        md += "\\n"
        md += generate_basic_info(summary)
        md += "\\n"
        md += generate_pk_code(summary)
        md += "\\n"
        deploy = generate_deploy_info(data)
        if deploy:
            md += deploy
            md += "\\n"
        scenes = generate_scenes(data)
        if scenes:
            md += scenes
            md += "\\n"
        terms = generate_terms(data)
        if terms:
            md += terms
            md += "\\n"
        constraints = generate_constraints(data)
        if constraints:
            md += constraints
            md += "\\n"
        supp = generate_suppliers(suppliers)
        if supp:
            md += supp
            md += "\\n---\\n\\n"
        md += generate_attrs_table(attrs)
        md += "\\n---\\n\\n"
        assoc_md = generate_assocs_table(assocs)
        if assoc_md:
            md += assoc_md

        parts = uri.split(".")
        short = ".".join(parts[-2:]) if len(parts) >= 2 else parts[-1]
        safe_display = summary['displayName'].replace("/", "_").replace("\\\\", "_")
        fname_out = f"{safe_display}-{short}.md"

        outpath = os.path.join(ENTITIES_DIR, fname_out)
        with open(outpath, 'w', encoding='utf-8') as f:
            f.write(md)
        print(f"  -> {fname_out} ({len(md)} chars)")

        new_uris = collect_new_uris(assocs, existing_uris, uri)
        all_new_uris.update(new_uris)
        existing_uris.add(uri)
        generated += 1

    print(f"\\n{'='*60}")
    print(f"完成: 生成 {generated} 个实体页面")

    if all_new_uris:
        print(f"\\n发现 {len(all_new_uris)} 个新的关联实体 URI:")
        for u in sorted(all_new_uris):
            print(f"  - {u}")
        out = os.path.join(JSON_DIR, "_new_uris_to_pull.txt")
        with open(out, 'w', encoding='utf-8') as f:
            f.write("\\n".join(sorted(all_new_uris)))
        print(f"\\n新 URI 列表已写入: {out}")
    else:
        print("没有发现新的关联实体 URI")

    return all_new_uris

if __name__ == "__main__":
    main()
""")